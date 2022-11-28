package s3t2n1execici1.subject;

import s3t2n1execici1.AgenteAbstract;

public interface ISubject {
	double getEstado();
	void setEstado(double estado);
	void agregar(AgenteAbstract agente);
	void notificar();
	
	

}
