package s3t2n1execici1;

import s3t2n1execici1.subject.*;

public class Main {

	public static void main(String[] args) {

		Ibex35 subject = new Ibex35();
		Ftse subject2 = new Ftse();
		Nyse subject3 = new Nyse();

		new AgenciaBCN(subject);
		new AgenciaBilbao(subject);
		new AgenciaMadrid(subject);

		new AgenciaBCN(subject2);
		new AgenciaBilbao(subject2);
		new AgenciaMadrid(subject2);

		new AgenciaBCN(subject3);
		new AgenciaBilbao(subject3);
		new AgenciaMadrid(subject3);

		subject.setEstado(8416.06);
		subject2.setEstado(7486.67);
		subject3.setEstado(15605.70);

		subject.setEstado(1890.12);
		subject2.setEstado(12132);
		subject3.setEstado(12322);

		subject.setEstado(9000.12);
		subject2.setEstado(520.02);
		subject3.setEstado(20300.23);

	}

}
