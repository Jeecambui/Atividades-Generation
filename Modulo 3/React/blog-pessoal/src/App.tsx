import React from 'react';
import Footer from './components/estaticos/footer/Footer';
import Navbar from './components/estaticos/navbar/Navbar';
import Home from './paginas/home/Home';
import Login from './paginas/login/Login';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import './App.css';


function App() {
  return (
    <>
      <Router>
        <Navbar />
          <Switch>
            <div style={{minHeight: '100vh'}}>
              <Route path= "/login">
                <Login />
              </Route>

              <Route path= "/home">
                <Home />
              </Route>
            </div>
          </Switch>
        <Footer />
      </Router>
    </>
  );
}

export default App;
