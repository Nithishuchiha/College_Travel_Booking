import React from "react";
import {AppBar, Menu, MenuItem, MenuList, Toolbar, Typography} from '@mui/material'

import "./Homepage.css"
import redcar from './redCar.png'
const Homepage = () => {
  return (
    <div className="homepage">
      <AppBar position="static" sx={{backgroundColor:"black"}}>
        <Toolbar>
          <MenuItem>
          CARLASELVOM
          </MenuItem>
          <MenuList sx={{display:'flex',justifyContent:'right',width:'100vw'}}>
            <MenuItem>Profile</MenuItem>
            <MenuItem>Logout</MenuItem>
          </MenuList>

        </Toolbar>
      </AppBar>
      <div className="Homepage-carLogo">
          <img className="imgcar" src={redcar}/>
      </div>
      <div className="Homepage-outer1">
        <div className="Homepage-outer1-bookride">
          <Typography>Book Ride</Typography> 
        </div>
        <div className="Homepage-outer1-publishride">
          <Typography>Publish Ride</Typography> 
          
        

        </div>
      </div >

      
    </div>
  );
};

export default Homepage;
