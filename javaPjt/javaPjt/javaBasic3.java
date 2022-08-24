package javaPjt;

import java.util.Iterator;

public class javaBasic3 {

	public static void main(String[] args) {
		// 구구단 출력
		// 이중반복구조
		int bigSeqNum = 2;
		while(bigSeqNum <= 9) {
			int seqNum = 1;
			while(seqNum <= 9) {
				System.out.println(
						String.format("%d x %d = %d", bigSeqNum,
						seqNum, bigSeqNum * seqNum));
				++seqNum;
			}
			++bigSeqNum;
		}
	}
}
