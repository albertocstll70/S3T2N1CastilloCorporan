package s3t2n1execici1;

import s3t2n1execici1.subject.*;

public class AgenciaMadrid extends AgenteAbstract {

	private double nyse = 15605.70;
	private double ftse = 7486.67;
	private double ibex35 = 8416.06;

	public AgenciaMadrid(ISubject estado) {
		this.subject = estado;
		this.subject.agregar(this);

	}

	@Override
	public void actualizar() {

		int compare;

		if (this.subject instanceof Nyse) {
			compare = Double.compare(this.nyse, this.subject.getEstado());
			if (compare > 0) {

				this.nyse = this.subject.getEstado();
				System.out.printf("\n NYSE: %.2f", subject.getEstado());
				System.out.printf(" -> AgeciaMadrid  (-) ");
			} else if (compare < 0) {
				this.nyse = this.subject.getEstado();
				System.out.printf("\n NYSE: %.2f", subject.getEstado());
				System.out.printf(" -> AgeciaMadrid (+)");
			}

		} else if (this.subject instanceof Ftse) {
			compare = Double.compare(this.ftse, this.subject.getEstado());
			if (compare > 0) {

				this.ftse = this.subject.getEstado();
				System.out.printf("\n NYSE: %.2f", subject.getEstado());
				System.out.printf(" -> AgeciaMadrid (-) ");
			} else if (compare < 0) {
				this.nyse = this.subject.getEstado();
				System.out.printf("\n NYSE: %.2f", subject.getEstado());
				System.out.printf(" -> AgeciaMadrid (+)");

			}

		} else if (this.subject instanceof Ibex35) {
			compare = Double.compare(this.ibex35, this.subject.getEstado());
			if (compare > 0) {

				this.ibex35 = this.subject.getEstado();
				System.out.printf("\n NYSE: %.2f", subject.getEstado());
				System.out.printf(" -> AgeciaMadrid (-) ");
			} else if (compare < 0) {
				this.nyse = this.subject.getEstado();
				System.out.printf("\n NYSE: %.2f", subject.getEstado());
				System.out.printf(" -> AgeciaMadrid (+)");

			}
		}
	}

}
