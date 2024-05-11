import React from "react";

import "./Homepage.css";
import {
  AppBar,
  Button,
  MenuItem,
  MenuList,
  Toolbar,
  Typography,
} from "@mui/material";

import people from "./people.png";
import carowner from "./carowner.png";
import { green } from "@mui/material/colors";
const Homepage = () => {
  return (
    <div className="homepage">
      
        <AppBar position="static" sx={{ backgroundColor: "black" }}>
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
      
      <div className="Homepage-outer1">
        {/* div continer for customer split */}
        <div className="Homepage-outer1-bookride">
          <div className="Homepage-outer1-bookride-container">
            <div
              className="Homepage-outer1-bookride-container-1"
              style={{ marginTop:"6vh",display: "flex" ,justifyContent:"center"}}
            >
              <h1>For</h1>
              <h1 style={{ color: "green", fontSize: "7vh" }}>Customer</h1>
            </div>
            <div style={{marginTop:"2dvh"}}>

            <div className="Homepage-outer1-bookride-container-description">
              <Typography style={{ color: "black" ,marginTop:"3vh"}}>
                Book your ride with friends who are leaving home through your
                route and reduce your travel expenses.
              </Typography>
              </div>
            <Button
              variant="contained"
              sx={{ width: "15vw", backgroundColor: "green" ,marginTop:"6vh"}}
              >
              Book Ride
            </Button>
                </div>
            
            

          </div>
        </div>
        {/* div continer for owner split */}
        <div className="Homepage-outer1-publishride">
          <div className="Homepage-outer1-publishride-container">
            <div
              className="Homepage-outer1-publishride-container-1"
              style={{ marginTop:"6vh",display: "flex", justifyContent:"center"}}
            >
              <h1>For</h1>
              <h1
                style={{ marginLeft: "1vh", color: "green", fontSize: "7vh" }}
              >
                Rider
              </h1>
            </div>
            <div style={{marginTop:"2dvh"}}>
              
            <div className="Homepage-outer1-publishride-container-description">
              <Typography style={{ color: "black" ,marginTop:"3vh"}}>
                Publish your ride and pick up your friends on the way to
                college. Earn rewards for sharing your ride with others.
              </Typography>
            </div>
            <Button
              variant="outlined"
              sx={{
                mt: "6vh",
                width: "18vw",
                color: "green",
                borderColor: "green",
                border:"0.25vh solid green "
              }}
              >
              Publish Ride
            </Button>
              </div>
          </div>
        </div>
      </div>
                <div className="about-1">
              
                <img className="about-1-people-image"src={people}></img>
                <Typography className="about-1-description" style={{ color: "black",marginTop:"9%",fontSize:"2vh",marginLeft:"7vh",marginRight:"7vh"}}>
                    Are you looking to save on travel expenses while reducing your carbon footprint? Our carpooling feature allows you to do just that! By booking rides with friends who are traveling through your route, you not only cut down on costs but also contribute to a greener environment by reducing the number of vehicles on the road.
                  </Typography>
                
                </div>
                <div className="about-2">
              
                <Typography className="about-2-description" style={{ color: "black",marginTop:"10%",fontSize:"2vh",marginLeft:"7vh",marginRight:"7vh"}}>
                Heading home or college ? Why not turn your empty car seats into cash with Sri Krishna's students ! Publish a ride and let other students hop in along your route. Not only will you be helping your fellow classmates save money on transportation, but you'll also earn some extra cash to cover your petrol expenses.
                  </Typography>
                <img className="about-2-people-image"src={carowner}></img>
                
                </div>


    </div>
  );
};

export default Homepage;
