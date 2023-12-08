package sample_main;

import sample_common.PropertyUtil;

public enum PropKey {
	KEY1,
	KEY2,
	KEY3;

	private final String key;

	private static final String envName = System.getenv("SAMPLE_ENV_NAME");
	private static final PropertyUtil PROP = new PropertyUtil("hoge-"+envName);

	PropKey(){
		this.key=name();
	}

	PropKey(String key){
		this.key=key;
	}

	@Override
	public String toString() {
		return PROP.getValue(key);
	}

	public String getValue() {
		return PROP.getValue(key);
	}

}
