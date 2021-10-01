package project;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;
//import junit.framework.TestCase;
//import org.junit.runner.JUnitCore;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import project.AppTest;

@RunWith(Suite.class)
@Suite.SuiteClasses( {AppTest.class, DeckTest.class, GameTest.class, HandTest.class, MeldTest.class, PlayerTest.class, TableTest.class, TileTest.class } )
public class TestSuite {

}