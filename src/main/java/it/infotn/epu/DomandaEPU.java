
package it.infotn.epu;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "DomandaEPU", targetNamespace = "http://epu.infotn.it")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DomandaEPU {


    /**
     * 
     * @param arg0
     * @return
     *     returns it.infotn.epu.DomandaWSCaricaOutput
     * @throws DomandaEpuFault_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public DomandaWSCaricaOutput carica(
        @WebParam(name = "arg0", partName = "arg0")
        DomandaWSCaricaInput arg0)
        throws DomandaEpuFault_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns it.infotn.epu.DomandaWSConsolidaOutput
     * @throws DomandaEpuFault_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public DomandaWSConsolidaOutput consolida(
        @WebParam(name = "arg0", partName = "arg0")
        DomandaWSConsolidaInput arg0)
        throws DomandaEpuFault_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns it.infotn.epu.DomandaWSAmbitiTerritorialiOutput
     * @throws DomandaEpuFault_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public DomandaWSAmbitiTerritorialiOutput elencoAmbitiTerritoriali(
        @WebParam(name = "arg0", partName = "arg0")
        DomandaWSAmbitiTerritorialiInput arg0)
        throws DomandaEpuFault_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns it.infotn.epu.DomandaWSComuniOutput
     * @throws DomandaEpuFault_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public DomandaWSComuniOutput elencoComuni(
        @WebParam(name = "arg0", partName = "arg0")
        DomandaWSComuniInput arg0)
        throws DomandaEpuFault_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns it.infotn.epu.DomandaWSEdizioniFinanziateOutput
     * @throws DomandaEpuFault_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public DomandaWSEdizioniFinanziateOutput elencoEdizioniFinanziate(
        @WebParam(name = "arg0", partName = "arg0")
        DomandaWSEdizioniFinanziateInput arg0)
        throws DomandaEpuFault_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns it.infotn.epu.DomandaWSEntiOutput
     * @throws DomandaEpuFault_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public DomandaWSEntiOutput elencoEnti(
        @WebParam(name = "arg0", partName = "arg0")
        DomandaWSEntiInput arg0)
        throws DomandaEpuFault_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns it.infotn.epu.DomandaWSEliminaOutput
     * @throws DomandaEpuFault_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public DomandaWSEliminaOutput elimina(
        @WebParam(name = "arg0", partName = "arg0")
        DomandaWSEliminaInput arg0)
        throws DomandaEpuFault_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns it.infotn.epu.DomandaWSModificaOutput
     * @throws DomandaEpuFault_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public DomandaWSModificaOutput modifica(
        @WebParam(name = "arg0", partName = "arg0")
        DomandaWSModificaInput arg0)
        throws DomandaEpuFault_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns it.infotn.epu.DomandaWSRegistraOutput
     * @throws DomandaEpuFault_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public DomandaWSRegistraOutput registra(
        @WebParam(name = "arg0", partName = "arg0")
        DomandaWSRegistraInput arg0)
        throws DomandaEpuFault_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns it.infotn.epu.DomandaWSRicercaOutput
     * @throws DomandaEpuFault_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public DomandaWSRicercaOutput ricerca(
        @WebParam(name = "arg0", partName = "arg0")
        DomandaWSRicercaInput arg0)
        throws DomandaEpuFault_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns it.infotn.epu.DomandaWSStampaOutput
     * @throws DomandaEpuFault_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public DomandaWSStampaOutput stampa(
        @WebParam(name = "arg0", partName = "arg0")
        DomandaWSStampaInput arg0)
        throws DomandaEpuFault_Exception
    ;

}
