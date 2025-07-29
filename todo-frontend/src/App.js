import React, { useState } from 'react';
import axios from 'axios';

function App() {
  const [loggedIn, setLoggedIn] = useState(false);
  const [todos, setTodos] = useState([]);
  const [form, setForm] = useState({ username: '', password: '' });

  const login = async () => {
    try {
      await axios.post('http://localhost:4000/login', form);
      setLoggedIn(true);
      fetchTodos();
    } catch (err) {
      alert('Invalid credentials');
    }
  };

  const fetchTodos = async () => {
    const res = await axios.get('http://localhost:4000/todos');
    setTodos(res.data);
  };

  const addTodo = async () => {
    const title = prompt('Enter todo title');
    await axios.post('http://localhost:4000/todos', { title });
    fetchTodos();
  };

  const deleteTodo = async (id) => {
    await axios.delete(`http://localhost:4000/todos/${id}`);
    fetchTodos();
  };

  if (!loggedIn) {
    return (
      <div>
        <h2>Login</h2>
        <input id="username" placeholder="Username" onChange={(e) => setForm({ ...form, username: e.target.value })} />
        <input id="password" type="password" placeholder="Password" onChange={(e) => setForm({ ...form, password: e.target.value })} />
        <button id="loginBtn" onClick={login}>Login</button>
      </div>
    );
  }

  return (
    <div id="todoPage">
      <h2>Todo List</h2>
      <button onClick={addTodo}>Add Todo</button>
      <ul>
        {todos.map(todo => (
          <li key={todo.id}>
            {todo.title}
            <button onClick={() => deleteTodo(todo.id)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
