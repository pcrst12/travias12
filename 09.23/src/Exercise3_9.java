class Exercise3_9 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = (('a'<= ch && ch <= 'z')||('A'<= ch && ch <= 'Z')||'0'<= ch && ch <= '9'); //삼항연산자?는 아니고 OR문

		System.out.println(b);
	}
}