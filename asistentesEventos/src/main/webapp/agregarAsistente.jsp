<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="WEB-INF/templates/header.jsp"></jsp:include>
<html>
<main>
    <c:if test="${errores != null}">
        <div class="columns is-centered mt-6">
                <div class="column is-6">
                    <div class="notification is-danger">
                            <h6>Existen Errores en el formulario</h6>
                            <div class="content">
                                    <ul>
                                        <c:forEach items="${errores}" var="error">
                                                <li>${error}</li>
                                        </c:forEach>
                                    </ul>
                            </div>
                    </div>
                </div>
        </div>
    </c:if>
    <div class="columns is-centered mt-6">
        
            <div class="column is-6">
                    <form method="POST" action="IngresarAsistentes">
                            <div class="card">
                                    <div class="card-header has-background-primary">
                                            <span class="card-header-title is-centered">Ingreso de
                                                    Asistente</span>
                                    </div>
                                    <div class="card-content">
                                            
        
                                                
                                                    <div class="field">
                                                            <label class="label" for="rut-txt">Rut</label>
                                                            <div class="columns">
                                                                <div class="column is-4">
                                                                    <div class="control">
                                                                            <input type="text" class="input"
                                                                                    placeholder="12345678 o 123456789" autocomplete="off"
                                                                                    id="rut-txt" name="rut-txt" maxlength="8" />
                                                                    </div>
                                                                </div>
                                                                <div class="column is-1">
                                                                    <div class="control has-text-centered">
                                                                        <span>-</span>
                                                                    </div>
                                                                </div>
                                                                <div class="column is-1">
                                                                    <div class="control">
                                                                            <input type="text" class="input"
                                                                                    placeholder="" autocomplete="off"
                                                                                    id="dv-txt" name="dv-txt" maxlength="1"/>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                    </div>
                                                
                                                
                                            
                                            
                                            <div class="field">
                                                    <label class="label" for="nombre-txt">Nombre</label>
                                                    <div class="control">
                                                            <input type="text" class="input" placeholder="Juan"
                                                                    autocomplete="off" id="nombre-txt" name="nombre-txt" />
                                                    </div>
                                            </div>
                                            <div class="field">
                                                    <label class="label" for="apellido-txt">Apellido</label>
                                                    <div class="control">
                                                            <input type="text" class="input" placeholder="Gonzalez"
                                                                    autocomplete="off" id="apellido-txt" name="apellido-txt" />
                                                    </div>
                                            </div>
                                            <div class="field">
                                                    <label class="label" for="edad-txt">Edad</label>
                                                    <div class="control">
                                                            <input type="number" name="edad-txt" id="edad-txt" class="input" />
                                                    </div>
                                            </div>
                                            <div class="field">
                                                    <label class="label" for="empresa-txt">Empresa</label>
                                                    <div class="control">
                                                            <input type="text" class="input" placeholder="Cencosud S.A"
                                                                    autocomplete="off" id="empresa-txt" name="empresa-txt" />
                                                    </div>
                                            </div>
                                            <div class="field">
                                                    <label class="label" for="estado-select">Estado</label>
                                                    <div class="control">
                                                            <div class="select">
                                                                    <select name="estado-select" id="estado-select">
                                                                            <option value="Pagada">Pagada</option>
                                                                            <option value="Con deuda">Con deuda</option>
                                                                    </select>
                                                            </div>
                                                    </div>
                                            </div>
                                            <div class="field">
                                                    <label class="label" for="region-select">Región</label>
                                                    <div class="control">
                                                            <div class="select">
                                                                    <select name="region-select" id="region-select">
                                                                            <option value="Valparaiso">Valparaíso</option>
                                                                            <option value="Santiago">Santiago</option>
                                                                            <option value="Norte de Chile">Norte de Chile</option>
                                                                            <option value="Sur de Chile">Sur de Chile</option>
                                                                            <option value="Internacional">Internacional</option>
                                                                    </select>
                                                            </div>
                                                    </div>
                                            </div>
                                    </div>
                                    <div class="card-footer has-text-centered">
                                            <div class="card-footer-item">
                                                    <button type="submit" class="button is-primary">Ingresar
                                                            Asistente</button>
                                            </div>
                                    </div>
                            </div>
                    </form>
            </div>
    </div>
</main>
</html>