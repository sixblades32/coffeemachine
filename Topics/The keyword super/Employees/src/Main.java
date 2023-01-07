class Employee {
    protected String name;
    protected String email;
    protected int experience;

    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getExperience() {
        return experience;
    }
}

class Developer extends Employee {
    protected String mainLanguage;
    protected String[] skills;

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);

        this.mainLanguage = mainLanguage;
        this.skills = skills.clone();
    }

    public String getMainLanguage() {
        return this.mainLanguage;
    }

    public String[] getSkills() {
        return this.skills.clone();
    }
}

class DataAnalyst extends Employee {
    protected boolean phd;
    protected String[] methods;

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);

        this.phd = phd;
        this.methods = methods.clone();
    }

    public boolean isPhd() {
        return this.phd;
    }

    public String[] getMethods() {
        return this.methods.clone();
    }
}