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
        System.out.println(hal.getMemory().getAvailable());
    }
}
