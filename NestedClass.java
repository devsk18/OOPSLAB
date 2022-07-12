class CPU {
    double price;
    // nested class
    class Processor{
 
        // members of nested class
        int cores;
        String manufacturer;
 
        Processor(int cores,String manufacturer){
            this.cores = cores;
            this.manufacturer = manufacturer;
        }
        void getProcessorData(){
            System.out.println("\nProcessor (No.of Cores | Manufacturer) : " + this.cores + " | " + this.manufacturer);
        }
        
    }
 
    // nested static class
    static class RAM{
 
        // members of static nested class
        int memory;
        String manufacturer;
 
        RAM(int memory,String manufacturer){
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
        void getRamData(){
            System.out.println("\nRam (Memory | Manufacturer) : " + this.memory + " GB | " + this.manufacturer);
        }
    }
}
 
public class NestedClass {
    public static void main(String[] args) {
 
        // create object of Outer class CPU
        CPU cpu = new CPU();
 
       // create an object of inner class Processor using outer class
        CPU.Processor processor = cpu.new Processor(4,"Intel");
 
        // create an object of inner class RAM using outer class CPU
        CPU.RAM ram = new CPU.RAM(8,"Crucial");
        
        System.out.println("---------CPU Details--------");
        
        processor.getProcessorData();
        ram.getRamData();
    }
}