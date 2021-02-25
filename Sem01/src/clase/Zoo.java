package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo { // aici vom avea o lista de animale
private List<Animal> lista;
private Zookeper keeper;

public Zoo(List<Animal> lista, Zookeper keeper) {
	super();
	this.lista = lista;
	this.keeper = keeper;
}	

public Zoo() {
	super();
	lista = new ArrayList<Animal>();   
	keeper = new Zookeper();
}	

public void add(Animal animal) 
{
	lista.add(animal);
}

public void feedAll() 
{
	for(Animal animal : lista) // echivalent la foreach(Animal animal in lista)
	{
		keeper.feed(animal); // ca sa hraneasca toata animalele
	}
}

public Zookeper getKeeper() {
	return keeper;
}

public void setKeeper(Zookeper keeper) {
	this.keeper = keeper;
}
	

}
