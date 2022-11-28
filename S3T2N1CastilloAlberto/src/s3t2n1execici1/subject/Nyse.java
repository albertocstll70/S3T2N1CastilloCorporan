package s3t2n1execici1.subject;

import java.util.ArrayList;
import s3t2n1execici1.*;

public class Nyse implements ISubject {

	private ArrayList<AgenteAbstract> agentes = new ArrayList<AgenteAbstract>();
	private double estado;

	@Override
	public double getEstado() {
		return estado;
	}

	@Override
	public void setEstado(double estado) {
		this.estado = estado;
		notificar();
	}

	@Override
	public void agregar(AgenteAbstract agente) {
		agentes.add(agente);
	}

	@Override
	public void notificar() {
		int i = 0;
		int size = agentes.size();
		while (i < size) {
			agentes.get(i).actualizar();
			i++;
		}

	}

}
