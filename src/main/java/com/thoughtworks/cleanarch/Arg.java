package com.thoughtworks.cleanarch;

public class Arg {
    private String flag;
    private String value;
    private String type;

    public Arg(String flag, String value, String type) {
        this.flag = flag;
        this.value = value;
        this.type = type;
    }

    public Arg(String flag, String value) {
        this.flag = flag;
        this.value = value;
    }

    public static Arg of(String argString) {
        String[] args = argString.split(" ");
        try {
            return new Arg(args[0],args[1]);
        } catch (Exception e) {
            return new Arg(args[0],null);
        }

    }

    public Object parseValue() {
        ValueFactory valueFactory = new ValueFactory();
        ValueHandler valueHandler = valueFactory.create(this.type);
        return valueHandler.handler(value);
    }

    public Boolean withFlag(String flag) {
        if (this.flag.equals(flag)) {
            return true;
        }
        return false;
    }

    public String getFlag() {
        return flag;
    }
}
