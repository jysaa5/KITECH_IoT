package iot.java.demo.team;

public class Player {
	private int[] seqList = new int[800];
	private int answer;
	private int now;
	public void set() {
		genNonOrderedSequence();
		answer = ((int)(Math.random()*10000))%900+100;
		now = 0;
	}
	public void genOrderedSequence() {
		int seq = 0;
		for(int i=1; i<10-2;++i) {
			for(int k=i+1; k<10-1;++k) {
				for(int m=k+1; m<10-0;++m) {
					int n = i*100+k*10+m;
					seqList[seq] = n;
					seq++;
				}				
			}
		}
	}
	public void genNonOrderedSequence() {
		int seq = 0;
		for(int i=1; i<10;++i) {
			for(int k=1; k<10;++k) {
				for(int m=1; m<10;++m) {
					if(i!=k && i!=m && k!=m) {
						int n = i*100+k*10+m;
						seqList[seq] = n;
						seq++;
					}
				}				
			}
		}
	}
	public int req() {
		// TODO Auto-generated method stub				
		while(seqList[now] == 0 ) ++now;
		return seqList[now];
	}
	public int[] resp(int param) {
		// TODO Auto-generated method stub
		return compare(answer, param);
	}
	public void listen(int[] rt) {
		// TODO Auto-generated method stub
		if( rt[0] + rt [1] == 0 ) {
			seqList[now] = 0;
			removeAll(seqList[now]);
		}
		
	}
	private void removeAll(int param) {
		// TODO Auto-generated method stub
		for(int i=0;i<seqList.length;++i) {
			if(seqList[i] != 0) {
				int[] rt = compare(seqList[i], param);
				if(rt[0]+rt[1]>0) {
					seqList[i] = 0;
				}
			}
		}
				
	}
	public int[] compare(int a, int b) {
		int[] result = new int[2];
		char[] as = Integer.toString(a).toCharArray();
		char[] bs = Integer.toString(b).toCharArray();
		System.out.println(String.copyValueOf(as) + " vs " + String.copyValueOf(bs));
		for (int ai = 0; ai < 3; ai++) {
			for (int bi = 0; bi < 3; bi++) {
				if (as[ai] == bs[bi]) {
					if (ai == bi)
						result[0]++;
					else
						result[1]++;
				}
			}
		}
		return result;
	}
	
}
