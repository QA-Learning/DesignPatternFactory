public class PC extends Computer {
    String RAM;
    String HDD;
    String CPU;


    public PC(String RAM, String HDD, String CPU){
        System.out.println("This is a PC");
        this.RAM= RAM;
        this.HDD=HDD;
        this.CPU=CPU;
    }

    @Override
    public String getRAM(){
        return this.RAM;
    }
    @Override
    public String getHDD(){
        return this.HDD;
    }
    @Override
    public String getCPU(){
        return this.CPU;
    }
}
