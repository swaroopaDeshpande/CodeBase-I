package SerializationConcept;

import java.io.Serializable;

public class CarObj implements Serializable {

	transient int ModelNo = 25;
	int ModelSerialNo = 22;
}
