package com.ibm.jp.sample.todo;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.jp.sample.todo.entity.ToDoEntry;
import com.ibm.jp.sample.todo.entity.ToDoList;

/**
 * Servlet implementation class AddScheduleServlet
 */
@WebServlet("/AddEntry")
public class AddToDoServlet extends HttpServlet {
       
    public AddToDoServlet() {
        super();
    }
    
    @Inject
    ToDoList toDoList;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = Long.toString(System.currentTimeMillis());
		String title = request.getParameter("title");
		String detail = request.getParameter("detail");
		
		ToDoEntry newToDo = new ToDoEntry(id, title, detail);
		toDoList.addSchedule(newToDo);

		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
