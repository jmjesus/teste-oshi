/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aprendendo.oshi;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;


/**
 *
 * @author Marcus
 */
public class Aprendendo {
    public static void main(String[] args) {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        CentralProcessor cpu = hal.getProcessor();
        OperatingSystem os = si.getOperatingSystem();
        GlobalMemory memory = hal.getMemory();
        
        //RETORNA A MEMORIA EM USO ATUAL: Available: 692,9 MiB/3,9 GiB
        //System.out.println(hal.getMemory());
        
        //RETORNA INFORMACOES SOBRE O PROCESSADOR
        //System.out.println(hal.getProcessor());
        
        //RETORNA INFORMACOES DO SISTEMA OPERACIONAL E BUILD
        //System.out.println(os);
        
        //RETORNA INFORMACOES SOBRE OS DISCOS FISICOS INSTALADOS (BUGOU QND TESTEI)
        //System.out.println(hal.getDiskStores());
        
        //System.out.println(os.getFileSystem());
        
        //RETORNA A QUANTIDADE DE NUCLEOS FISICOS
        //System.out.println(si.getHardware().getProcessor().getPhysicalProcessorCount());
        
        //RETORNA A QUANTIDADE DE NUCLEOS LOGICOS
        //System.out.println(si.getHardware().getProcessor().getLogicalProcessorCount());
        
        //RETORNA OS PROCESSOS (BUGOU)
        //System.out.println(si.getOperatingSystem().getProcesses());
        
        //RETORNA A CONTAGEM DE PROCESSOS ATIVOS
        //System.out.println(os.getProcessCount());
        
        //NAO SEI AINDA MAS APARENTEMENTE PEGA O PID
        //System.out.println(os.getProcessId());
        
        
        //RETORNA O TOTAL DE MEMORIA INSTALADA NO SISTEMA
        //System.out.println(si.getHardware().getMemory().getTotal());
        
        
        //RETORNA O ENUM DO SISTEMA OPERACIONAL UTILIZADO
        //System.out.println(SystemInfo.getCurrentPlatformEnum());
        
        //RETORNA A MEMORIA DISPONIVEL EM BYTES
        //System.out.println(hal.getMemory().getAvailable());

        // -------------------------------------------------------------------------

        System.out.println(os.toString());
        // Microsoft Windows 10 (Home) build 18363
        
        System.out.println(String.format("Booted: %s", Instant.ofEpochSecond(os.getSystemBootTime())));
        // Booted: 2020-04-19T16:08:41Z - DATA VEIO NO FORMATO CERTO MAS ESTAVA ERRADA
        
        System.out.println(String.format("Uptime: %s", FormatUtil.formatElapsedSecs(os.getSystemUptime())));
        // Uptime: 0 days, 21:46:18 - formato x dias, Hora:Minutos:Segundos - MAS RETORNOU O TEMPO ERRADO
     
        System.out.println(String.format("Running with%s", (os.isElevated() ? "" : "out") + " elevated permissions."));
        // Running without elevated permissions. - APARENTEMENTE DEU CERTO
        
        //private static void printComputerSystem(final ComputerSystem computerSystem) {
        //oshi.add("system: " + computerSystem.toString());
        //oshi.add(" firmware: " + computerSystem.getFirmware().toString());
        //oshi.add(" baseboard: " + computerSystem.getBaseboard().toString());
        //} 
        //PRECISO APRENDER MELHOR COMO FUNCIONA
        
        System.out.println(String.format("%s", hal.getProcessor()));
        //Intel(R) Core(TM) i3-5015U CPU @ 2.10GHz
        //1 physical CPU package(s)
        //2 physical CPU core(s)
        //4 logical CPU(s)
        //Identifier: Intel64 Family 6 Model 61 Stepping 4
        //ProcessorID: BFEBFBFF000306D4
        //Microarchitecture: Broadwell (Client)

        System.out.println(String.format("Memory: %s", hal.getMemory()));
        //Available: 583,1 MiB/3,9 GiB
        
        System.out.println(String.format("Swap: %s", memory.getVirtualMemory()));
        //Used: 613,3 MiB/3,2 GiB

        PhysicalMemory[] pmArray = memory.getPhysicalMemory();

        if (pmArray.length > 0) {
            System.out.println("Physical Memory: ");
            for (PhysicalMemory pm : pmArray) {
                System.out.println(" " + pm.toString());
            }
        }
        //Physical Memory: 
        //Bank label: BANK 0, Capacity: 4 GiB, Clock speed: 1,6 GHz, Manufacturer: 0715, Memory type: DDR3
        //System.out.println(String.format("%s", memory.getPhysicalMemory().toString())); - TENTEI FAZER O MESMO COM ESSE COMANDO MAS N DEU CERTO
    }
}
