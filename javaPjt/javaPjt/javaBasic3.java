package javaPjt;

import java.util.Iterator;

public class javaBasic3 {

	public static void main(String[] args) {
		// ������ ���
		// ���߹ݺ�����
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
