package mx.grekz.challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScopeChallengeJuanMendoza {
	private static List<String> createSchedule(List<String> workshops) {
		String meetCol = " Meet Your Colleagues Event";
		List<String> res = new ArrayList<>();
		Map<Integer, List<String>> map = new TreeMap<>(Collections.reverseOrder());
		List<Integer> times = new ArrayList<>();
		for (String x : workshops) {
			findname: for (int i = x.length() - 1; i >= 0; i--) {
				char cc = x.charAt(i);
				if (cc == ' ') {
					String time = x.substring(i + 1);
					Integer minutes = getMinutes(time);
					map.putIfAbsent(minutes, new ArrayList<String>());
					map.get(minutes).add(x);
					times.add(minutes);
					break findname;
				}
			}
		}
		Collections.sort(times, Collections.reverseOrder());
		int tracks = 1;
		while (!map.isEmpty()) {
			res.add("Track " + tracks++ + ":");
			int currTime = 0;
			int sum = 0;
			List<Integer> tmp = new ArrayList<>();
			for (int i = 0; i < times.size(); i++) {
				int time = times.get(i);
				if (time == -1)
					continue;
				sum += time;
				tmp.add(0, time);
				if (sum > 180) {
					tmp.remove(0);
					sum -= time;
				} else {
					times.set(i, -1);
					if (sum == 180) {
						break;
					}
				}
			}
			res.addAll(fill(tmp, map, 0));
			currTime = 180;
			res.add(translateTime(currTime) + "Lunch");
			currTime += 60;
			if (map.isEmpty()) {
				res.add(translateTime(currTime) + meetCol);
				break;
			}
			sum = 0;
			tmp = new ArrayList<>();
			for (int i = 0; i < times.size(); i++) {
				int time = times.get(i);
				if (time == -1)
					continue;
				sum += time;
				tmp.add(0, time);
				if (sum > 240) {
					tmp.remove(0);
					sum -= time;
				} else {
					times.set(i, -1);
					if (sum == 240) {
						break;
					}
				}
			}
			res.addAll(fill(tmp, map, currTime));
			currTime += sum;
			res.add(translateTime(currTime) + meetCol);
		}
		return res;
	}

	private static Collection<? extends String> fill(List<Integer> tmp, Map<Integer, List<String>> map, int j) {
		List<String> res = new ArrayList<String>();
		for (int i : tmp) {
			List<String> val = map.get(i);
			res.add(translateTime(j) + val.remove(0));
			j += i;
			if (val.isEmpty())
				map.remove(i);
		}
		return res;
	}

	private static String translateTime(Integer time) {
		int hr = time / 60 + 9;
		int mins = time % 60;
		int late = hr % 12;
		return (hr == 12 ? "12" : (late < 10 ? "0" + late : late)) + ":" + (mins < 10 ? "0" + mins : mins)
				+ (hr > 11 ? "PM" : "AM") + " ";
	}

	@SuppressWarnings("unused")
	private static void printMap(@SuppressWarnings("rawtypes") Map map) {
		System.out.println(Arrays.toString(map.entrySet().toArray()));
	}

	@SuppressWarnings("unused")
	private static void printList(@SuppressWarnings("rawtypes") List list) {
		System.out.println(Arrays.toString(list.toArray()));
	}

	private static Integer getMinutes(String time) {
		if (time.equals("lightning")) {
			return 5;
		}
		for (int i = 0; i < time.length(); i++) {
			if (!Character.isDigit(time.charAt(i)))
				return Integer.parseInt(time.substring(0, i));
		}
		return 0;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File(System.getProperty("user.dir") + "/input.txt"));
		List<String> workshops = new ArrayList<>();
		while (in.hasNext()) {
			workshops.add(in.nextLine().trim());
		}
		for (String x : createSchedule(workshops)) {
			System.out.println(x);
		}
	}
}
