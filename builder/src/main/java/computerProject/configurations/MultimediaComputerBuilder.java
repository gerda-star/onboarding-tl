package computerProject.configurations;

import computerProject.Computer;
import computerProject.ComputerBuilder;

public class MultimediaComputerBuilder implements ComputerBuilder {
    private String cpu;
    private String ram;
    private String graphicsCard;
    private String powerSupply;
    private String hardDisk;
    private String monitor;
    private String headphone;
    private String printer;
    private String stylus;

    public MultimediaComputerBuilder() {
        super();
    }

    @Override
    public ComputerBuilder addCPU() {
        System.out.println("... Assembling the CPU");
        this.cpu = "CPU for creating multimedia projects";
        return this;
    }

    @Override
    public ComputerBuilder addRAM() {
        System.out.println("... Assembling the RAM");
        this.ram = "RAM for creating multimedia projects";
        return this;
    }

    @Override
    public ComputerBuilder addGraphicsCard() {
        System.out.println("... Assembling the Graphics Card");
        this.graphicsCard = "Graphics Card for creating multimedia projects";
        return this;
    }

    @Override
    public ComputerBuilder addPowerSupply() {
        System.out.println("... Assembling the Power Supply");
        this.powerSupply = "Power Supply for creating multimedia projects";
        return this;
    }

    @Override
    public ComputerBuilder addHardDisk() {
        System.out.println("... Assembling the Hard Disk");
        this.hardDisk = "Hard Disk for creating multimedia projects";
        return this;
    }

    @Override
    public ComputerBuilder addMonitor() {
        System.out.println("... Assembling the Monitor");
        this.monitor = "Monitor for creating multimedia projects";
        return this;
    }

    @Override
    public ComputerBuilder addHeadphone() {
        System.out.println("... Assembling the Headphone");
        this.headphone = "Headphone for multimedia projects";
        return this;
    }

    @Override
    public ComputerBuilder addPrinter() {
        this.printer = null;
        return this;
    }

    @Override
    public ComputerBuilder addStylus() {
        System.out.println("... Assembling the Stylus");
        this.stylus = "Stylus for multimedia projects";
        return this;
    }

    @Override
    public Computer build() {
        Computer computer = new Computer(cpu, ram, graphicsCard, powerSupply, hardDisk, monitor, headphone, printer, stylus);
        if (computer.doQualityCheck()) {
            System.out.println("Computer for creating multimedia projects is assembled!");
            return computer;
        } else {
            System.out.println("Computer assembly is incomplete!");
        }
        return null;
    }
}
