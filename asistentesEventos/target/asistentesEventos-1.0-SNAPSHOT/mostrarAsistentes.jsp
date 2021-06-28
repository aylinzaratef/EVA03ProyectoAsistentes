<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="WEB-INF/templates/header.jsp"></jsp:include>

<html>
<main>
    <div class="columns is-centered mt-6">
            <div class="column is-8">
                <form method="GET" action="MostrarAsistentes">
                    <div class="field has-addons">
                        <div class="control ">
                          <div class="select is-fullwidth">
                            <select name="estado-select" id="estado-select">
                                <option value="Pagada">Pagada</option>
                                <option value="Con deuda">Con deuda</option>
                            </select>
                          </div>
                        </div>
                        <div class="control">
                          <button type="submit" class="button is-primary">Filtrar</button>
                        </div>
                    </div>
                </form>
            </div>
    </div>
    <div class="columns is-centered mt-6">
            <div class="column is-8">
                <div class="table-container">
                    <table class="table is-fullwidth is-bordered is-striped is-narrow is-hoverable">
                        <thead>
                            <tr>
                                <th>Nombre</th>
                                <th>Empresa</th>
                                <th>Estado</th>
                                <th>Region</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${asistentes}" var="asistente">
                            <tr>
                                <td>${asistente.nombre} ${asistente.apellido}</td>
                                <td>${asistente.empresa}</td>
                                <td>${asistente.estado}</td>
                                <td>${asistente.region}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
    </div>
    <div class="columns is-centered mt-6">
            <div class="column is-8">
                <span class="tag">
                    Total de registros: ${fn:length(asistentes)}
                </span>
            </div>
    </div>
</main>
</html>