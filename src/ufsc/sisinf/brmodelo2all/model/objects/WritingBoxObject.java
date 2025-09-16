package ufsc.sisinf.brmodelo2all.model.objects;

public class WritingBoxObject extends ModelingObject {

	private static final long serialVersionUID = 1L;

	public WritingBoxObject(String name) {
		super(name);

	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int windowHeight() {
		return 240;
	}

	public String getStyle() {
		return "WritingBox";
	}

}