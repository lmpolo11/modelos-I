package co.edu.udistrital.interfaces;

import co.edu.udistrital.*;

public interface HouseBuilder {
	public void buildBasement();

	public void buildStructure();

	public void buildRoof();

	public void buildInterior();

	public House getHouse();
}
