package edu.oop.method.ex;

public class RPGGameCharacter {

    private String job;
    private int jobLevel;
    private int jobStr;
    private int jobDef;
    private int jobMagic;

    private int jobTotal;
    private int jobPower;
    private String jobRank;

    public RPGGameCharacter() {
    }

    public RPGGameCharacter(String job, int jobLevel, int jobStr, int jobDef, int jobMagic) {
        this.job = job;
        this.jobLevel = jobLevel;
        this.jobStr = jobStr;
        this.jobDef = jobDef;
        this.jobMagic = jobMagic;
    }

    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public int getJobLevel() {
        return jobLevel;
    }
    public void setJobLevel(int jobLevel) {
        this.jobLevel = jobLevel;
    }
    public int getJobStr() {
        return jobStr;
    }
    public void setJobStr(int jobStr) {
        this.jobStr = jobStr;
    }
    public int getJobDef() {
        return jobDef;
    }
    public void setJobDef(int jobDef) {
        this.jobDef = jobDef;
    }
    public int getJobMagic() {
        return jobMagic;
    }
    public void setJobMagic(int jobMagic) {
        this.jobMagic = jobMagic;
    }
    public int getJobTotal() {
        return jobTotal;
    }
    public void setJobTotal(int jobTotal) {
        this.jobTotal = jobTotal;
    }
    public int getJobPower() {
        return jobPower;
    }
    public void setJobPower(int jobPower) {
        this.jobPower = jobPower;
    }
    public String getJobRank() {
        return jobRank;
    }
    public void setJobRank(String jobRank) {
        this.jobRank = jobRank;
    }





    public  void jobTotalCal() {
        setJobTotal(getJobStr() + getJobDef() + getJobMagic());
    }

    public  void jobPowerCal() {
        setJobPower((getJobStr() * 2) + getJobDef() + (getJobMagic() / 2));
    }

    public  void jobRankCal() {
        int power = getJobPower();
        if (power >= 200) setJobRank("전설급");
        else if (power >= 150) setJobRank("영웅급");
        else if (power >= 100) setJobRank("고수급");
        else setJobRank("초보급");
    }

    public void jobInfo() {
        System.out.println("🗡️ " + getJob() + " (레벨 " + getJobLevel() + ")");
        System.out.println("힘: " + getJobStr() + " | 방어: " + getJobDef() + " | 마법: " + getJobMagic());
        System.out.println("총 스탯: " + getJobTotal() + " | 전투력: " + getJobPower());
        System.out.println("등급: " + getJobRank());
        System.out.println();
    }

    public static void partyInfo(RPGGameCharacter ch1, RPGGameCharacter ch2, RPGGameCharacter ch3) {
        System.out.println("🎮 파티 정보 🎮");
        System.out.println("파티원 수: 3명");
        System.out.println("평균 레벨: " + (ch1.getJobLevel() + ch2.getJobLevel() + ch3.getJobLevel()) / 3);
        System.out.println("총 전투력: " + (ch1.getJobPower() + ch2.getJobPower() + ch3.getJobPower()));
    }

    // public static void strongest(int ch1Power, int ch2Power, int ch3Power, String ch1job, String ch2job, String ch3job) {
    public static void strongest(RPGGameCharacter ch1, RPGGameCharacter ch2, RPGGameCharacter ch3) {
        if (ch1.getJobPower() >= ch2.getJobPower() && ch1.getJobPower() >= ch3.getJobPower()) {
            System.out.println("최강 캐릭터: " + ch1.getJob() + " (전투력: " + ch1.getJobPower() + ")");
        } else if (ch2.getJobPower() >= ch1.getJobPower() && ch2.getJobPower() >= ch3.getJobPower()) {
            System.out.println("최강 캐릭터: " + ch2.getJob() + " (전투력: " + ch2.getJobPower() + ")");
        } else {
            System.out.println("최강 캐릭터: " + ch3.getJob() + " (전투력: " + ch3.getJobPower() + ")");
        }
    }

    public void method(){
        jobTotalCal();
        jobPowerCal();
        jobRankCal();
        jobInfo();
    }

}






