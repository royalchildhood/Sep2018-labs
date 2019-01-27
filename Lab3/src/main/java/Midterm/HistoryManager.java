package Midterm;

import java.util.ArrayList;

public class HistoryManager {
	private ArrayList<History> historys;
	public HistoryManager () {
		historys = new ArrayList<History>();
	}

	public void save(String webAddress, int time) {
		History newEntry = new History(webAddress, time);
		historys.add(newEntry);
	}

	public void delete (int time) {
		for (int i =0; i < historys.size(); i++) {
			if (historys.get(i).visitedTime <= time) {
				historys.remove(i);
			}
		}
	}

	public History[] search(int begin, int end) {

		if(begin < 0 || end > historys.size()) return new History[0];

		ArrayList<History> result = new ArrayList<History>();
		for (int i =0; i < historys.size(); i++) {
			if (historys.get(i).visitedTime >= begin &&  historys.get(i).visitedTime <= end) {
				result.add(historys.get(i));
			}
		}

		History[] list = new History[result.size()];
		for (int i = 0; i < result.size(); i++) {
			list[i] = historys.get(i);
		}

		return list;
	}
}
