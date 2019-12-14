 class simple {
	static void p() {
		System.out.println("Stack overflow become kindely stop it");
		p();
	}

	public static void main(String[] args) {
	p();

	}

}
