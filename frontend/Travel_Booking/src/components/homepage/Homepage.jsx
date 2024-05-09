import React from "react";

import "./Homepage.css";
import { AppBar, Button, MenuItem, MenuList, Toolbar } from "@mui/material";

import redcar from "./redCar.png";
const Homepage = () => {
  return (
    <div className="homepage">
      <div className="appbar-caranime">
      <AppBar position="static" sx={{ backgroundColor: "rgba(0, 0, 0, 0.85)" }}>
        <Toolbar>
          <MenuItem>CARLASELVOM</MenuItem>
          <MenuList
            sx={{ display: "flex", justifyContent: "right", width: "100vw" }}
          >
            <MenuItem>Profile</MenuItem>
            <MenuItem>Logout</MenuItem>
          </MenuList>
        </Toolbar>
      </AppBar>
      <div className="Homepage-carLogo">
        <img className="imgcar" src={redcar} />
      </div>

      </div>
      <div className="Homepage-outer1">
        <div className="Homepage-outer1-bookride">
          <Button>Book Ride</Button>
        </div>
        <div className="Homepage-outer1-publishride">
          <Button>Publish Ride</Button>
        </div>
      </div>
    </div>
  );
};

export default Homepage;
