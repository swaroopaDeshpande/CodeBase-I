package JavaSessions;

public class MemoryManagementConcept {

	// java memory=Heap Memory+permannat generation
	// heap memory= young generation+old generation
	// young generation = eden memory+serviour memory01+servivour memory02

	// whenever new object created first its given to young generation
	// Minor GC1 automatically called--> when eden memory is full objects
	// shifted to s1 and then s1 full,then
	// objects shifted to s2
	// GC collection in heap memory minor GC perform automatically
	// GC1,GC2,GC3
	// Test t1= new Test()
	// t1=null; this kind of objects are distroyed

	// Old generation is fulled :Major GC
	// major gc takes longer time

	// permant generation
	// Meta data of class /methods
	// it's not part of heap memorywill be generated at run time
	// method area-complete class structure stored,static and constant vars in
	// method area
	//

}
