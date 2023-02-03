package Variable;

class AccessWay {
	static int num = 0;
	
	AccessWay(){
		incrCnt();
	}
	void incrCnt() {
		num++;
	}
}
