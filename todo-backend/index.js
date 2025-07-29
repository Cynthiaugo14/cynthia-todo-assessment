const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser');
const { v4: uuid } = require('uuid');

const app = express();
app.use(cors());
app.use(bodyParser.json());

const validUser = { username: 'cynthia', password: 'cynthia23' };
let todos = [];

app.post('/login', (req, res) => {
  const { username, password } = req.body;
  if (username === validUser.username && password === validUser.password) {
    return res.sendStatus(200);
  } else {
    return res.status(401).json({ error: 'Invalid credentials' });
  }
});

app.get('/todos', (req, res) => res.json(todos));

app.post('/todos', (req, res) => {
  const todo = { id: uuid(), title: req.body.title };
  todos.push(todo);
  res.json(todo);
});

app.delete('/todos/:id', (req, res) => {
  todos = todos.filter(todo => todo.id !== req.params.id);
  res.sendStatus(204);
});

app.listen(4000, () => console.log('Backend running on http://localhost:4000'));
