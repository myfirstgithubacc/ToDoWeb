package com.ibm.jp.sample.todo;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.jp.sample.todo.entity.ToDoList;

/**
 * Servlet implementation class RemoveToDoServlet
 */
@WebServlet("/RemoveEntry")
public class RemoveToDoServlet extends HttpServlet {

    public RemoveToDoServlet() {
        super();
    }

    @Inject
    ToDoList toDoList;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		
		toDoList.removeSchedule(id);

		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
