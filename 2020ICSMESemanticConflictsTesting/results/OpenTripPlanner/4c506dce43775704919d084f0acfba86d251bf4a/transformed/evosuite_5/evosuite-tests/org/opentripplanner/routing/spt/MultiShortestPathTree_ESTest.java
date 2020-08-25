/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 22:52:23 GMT 2020
 */

package org.opentripplanner.routing.spt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.DefaultCoordinateSequenceFactory;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.LineString;
import com.vividsolutions.jts.geom.MultiPolygon;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.PrecisionModel;
import com.vividsolutions.jts.geom.impl.CoordinateArraySequence;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import org.onebusaway.gtfs.model.Stop;
import org.opentripplanner.routing.bike_rental.BikeRentalStation;
import org.opentripplanner.routing.core.OptimizeType;
import org.opentripplanner.routing.core.RoutingRequest;
import org.opentripplanner.routing.core.State;
import org.opentripplanner.routing.core.TraverseMode;
import org.opentripplanner.routing.core.TraverseModeSet;
import org.opentripplanner.routing.edgetype.AreaEdge;
import org.opentripplanner.routing.edgetype.AreaEdgeList;
import org.opentripplanner.routing.edgetype.ElevatorBoardEdge;
import org.opentripplanner.routing.edgetype.ParkAndRideEdge;
import org.opentripplanner.routing.edgetype.PartialStreetEdge;
import org.opentripplanner.routing.edgetype.RentABikeOffEdge;
import org.opentripplanner.routing.edgetype.StationStopEdge;
import org.opentripplanner.routing.edgetype.StreetBikeRentalLink;
import org.opentripplanner.routing.edgetype.StreetEdge;
import org.opentripplanner.routing.edgetype.StreetTraversalPermission;
import org.opentripplanner.routing.graph.Edge;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.graph.Vertex;
import org.opentripplanner.routing.location.StreetLocation;
import org.opentripplanner.routing.services.StreetVertexIndexFactory;
import org.opentripplanner.routing.spt.GraphPath;
import org.opentripplanner.routing.spt.MultiShortestPathTree;
import org.opentripplanner.routing.vertextype.BikeRentalStationVertex;
import org.opentripplanner.routing.vertextype.ElevatorOnboardVertex;
import org.opentripplanner.routing.vertextype.ExitVertex;
import org.opentripplanner.routing.vertextype.IntersectionVertex;
import org.opentripplanner.routing.vertextype.OnboardDepartVertex;
import org.opentripplanner.routing.vertextype.ParkAndRideVertex;
import org.opentripplanner.routing.vertextype.TransitStation;
import org.opentripplanner.routing.vertextype.TransitStop;
import org.opentripplanner.routing.vertextype.TransitStopDepart;
import org.opentripplanner.routing.vertextype.TransitStopStreetVertex;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiShortestPathTree_ESTest extends MultiShortestPathTree_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      TraverseMode traverseMode0 = TraverseMode.SUBWAY;
      RoutingRequest routingRequest0 = new RoutingRequest(traverseMode0);
      RoutingRequest routingRequest1 = routingRequest0.reversedClone();
      RoutingRequest routingRequest2 = routingRequest1.clone();
      MultiShortestPathTree multiShortestPathTree0 = new MultiShortestPathTree(routingRequest2);
      int int0 = 389;
      routingRequest1.addIntermediatePlace(routingRequest2.from);
      routingRequest1.elevatorBoardCost = int0;
      routingRequest1.clearModes();
      double double0 = 213.51;
      routingRequest0.carAccelerationSpeed = double0;
      routingRequest0.setWheelchairAccessible(routingRequest1.allowBikeRental);
      int int1 = 0;
      routingRequest2.boardSlack = int1;
      Set<Vertex> set0 = multiShortestPathTree0.getVertices();
      int int2 = multiShortestPathTree0.getVertexCount();
      double double1 = 0.0;
      MultiShortestPathTree.WALK_DIST_EPSILON = double1;
      Collection<State> collection0 = multiShortestPathTree0.getAllStates();
      Collection<State> collection1 = multiShortestPathTree0.getAllStates();
      Set<Vertex> set1 = multiShortestPathTree0.getVertices();
      Collection<State> collection2 = multiShortestPathTree0.getAllStates();
      int int3 = multiShortestPathTree0.getVertexCount();
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      State state0 = null;
      // Undeclared exception!
      try { 
        MultiShortestPathTree.dominates(state0, state0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.opentripplanner.routing.spt.MultiShortestPathTree", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      MultiShortestPathTree multiShortestPathTree0 = new MultiShortestPathTree();
      MultiShortestPathTree.WEIGHT_EPSILON = (double) multiShortestPathTree0.WEIGHT_DIFF_MARGIN;
      double double0 = 418.85;
      HashMap<Vertex, List<State>> hashMap0 = new HashMap<Vertex, List<State>>();
      multiShortestPathTree0.stateSets = (Map<Vertex, List<State>>) hashMap0;
      MultiShortestPathTree.TIME_EPSILON = double0;
      MultiShortestPathTree.WALK_DIST_EPSILON = (double) multiShortestPathTree0.WEIGHT_DIFF_MARGIN;
      String string0 = multiShortestPathTree0.toString();
      String string1 = "";
      double double1 = 624.8422444295845;
      OnboardDepartVertex onboardDepartVertex0 = new OnboardDepartVertex(string1, double1, multiShortestPathTree0.TIME_DIFF_MARGIN);
      List<State> list0 = multiShortestPathTree0.getStates(onboardDepartVertex0);
      int int0 = (-1);
      List<State> list1 = hashMap0.put(onboardDepartVertex0, list0);
      onboardDepartVertex0.setIndex(int0);
      State state0 = null;
      // Undeclared exception!
      try { 
        multiShortestPathTree0.add(state0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.opentripplanner.routing.spt.MultiShortestPathTree", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      MultiShortestPathTree multiShortestPathTree0 = new MultiShortestPathTree();
      Graph graph0 = new Graph();
      Stop stop0 = new Stop();
      Stop stop1 = new Stop(stop0);
      TransitStop transitStop0 = null;
      try {
        transitStop0 = new TransitStop(graph0, stop1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.opentripplanner.gtfs.GtfsLibrary", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      RoutingRequest routingRequest0 = null;
      MultiShortestPathTree multiShortestPathTree0 = new MultiShortestPathTree(routingRequest0);
      String string0 = "org.joda.time.format.DateTimeFormatterBuilder$Fraction";
      ObjectInputStream objectInputStream0 = null;
      Graph.LoadLevel graph_LoadLevel0 = Graph.LoadLevel.FULL;
      // Undeclared exception!
      try { 
        Graph.load(objectInputStream0, graph_LoadLevel0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.opentripplanner.routing.graph.Graph", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      TraverseMode traverseMode0 = TraverseMode.TRANSIT;
      RoutingRequest routingRequest0 = new RoutingRequest(traverseMode0);
      String string0 = "TRANSFERS";
      MockFile mockFile0 = new MockFile(string0);
      Graph.LoadLevel graph_LoadLevel0 = Graph.LoadLevel.DEBUG;
      try { 
        Graph.load((File) mockFile0, graph_LoadLevel0);
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      MultiShortestPathTree multiShortestPathTree0 = new MultiShortestPathTree();
      // Undeclared exception!
      try { 
        multiShortestPathTree0.getVertexCount();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.opentripplanner.routing.spt.MultiShortestPathTree", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      MultiShortestPathTree multiShortestPathTree0 = new MultiShortestPathTree();
      Graph graph0 = new Graph();
      String string0 = "";
      String string1 = " : ";
      TransitStopStreetVertex transitStopStreetVertex0 = new TransitStopStreetVertex(graph0, string0, multiShortestPathTree0.WEIGHT_DIFF_MARGIN, multiShortestPathTree0.WEIGHT_EPSILON, graph0.routerId, string1);
      // Undeclared exception!
      try { 
        multiShortestPathTree0.getState(transitStopStreetVertex0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.opentripplanner.routing.spt.MultiShortestPathTree", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      MultiShortestPathTree multiShortestPathTree0 = new MultiShortestPathTree();
      double double0 = 0.0;
      double double1 = 0.0;
      MultiShortestPathTree.WEIGHT_EPSILON = double1;
      MultiShortestPathTree.WEIGHT_EPSILON = double0;
      // Undeclared exception!
      try { 
        multiShortestPathTree0.getAllStates();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.opentripplanner.routing.spt.MultiShortestPathTree", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      TraverseMode[] traverseModeArray0 = new TraverseMode[6];
      TraverseMode traverseMode0 = TraverseMode.CABLE_CAR;
      traverseModeArray0[0] = traverseMode0;
      TraverseMode traverseMode1 = TraverseMode.TRAM;
      traverseModeArray0[1] = traverseMode1;
      TraverseMode traverseMode2 = TraverseMode.CABLE_CAR;
      traverseModeArray0[2] = traverseMode2;
      TraverseMode traverseMode3 = TraverseMode.CABLE_CAR;
      traverseModeArray0[3] = traverseMode3;
      TraverseMode traverseMode4 = TraverseMode.BUSISH;
      traverseModeArray0[4] = traverseMode4;
      TraverseMode traverseMode5 = TraverseMode.CUSTOM_MOTOR_VEHICLE;
      traverseModeArray0[5] = traverseMode5;
      TraverseModeSet traverseModeSet0 = new TraverseModeSet(traverseModeArray0);
      TraverseModeSet traverseModeSet1 = traverseModeSet0.clone();
      boolean boolean0 = false;
      traverseModeSet1.setCableCar(boolean0);
      boolean boolean1 = true;
      traverseModeSet1.setTransit(boolean1);
      traverseModeSet1.setCableCar(boolean1);
      RoutingRequest routingRequest0 = new RoutingRequest(traverseModeSet1);
      MultiShortestPathTree multiShortestPathTree0 = new MultiShortestPathTree(routingRequest0);
      routingRequest0.cleanup();
      int int0 = multiShortestPathTree0.getVertexCount();
      Collection<State> collection0 = multiShortestPathTree0.getAllStates();
      State state0 = null;
      // Undeclared exception!
      try { 
        multiShortestPathTree0.add(state0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.opentripplanner.routing.spt.MultiShortestPathTree", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      MultiShortestPathTree multiShortestPathTree0 = new MultiShortestPathTree();
      // Undeclared exception!
      try { 
        multiShortestPathTree0.toString();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.opentripplanner.routing.spt.MultiShortestPathTree", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      MultiShortestPathTree multiShortestPathTree0 = new MultiShortestPathTree();
      Graph graph0 = new Graph();
      State state0 = null;
      // Undeclared exception!
      try { 
        multiShortestPathTree0.visit(state0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.opentripplanner.routing.spt.MultiShortestPathTree", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      TraverseMode traverseMode0 = TraverseMode.RAIL;
      RoutingRequest routingRequest0 = new RoutingRequest(traverseMode0);
      int int0 = 1242;
      routingRequest0.worstTime = (long) int0;
      routingRequest0.numItineraries = int0;
      MultiShortestPathTree multiShortestPathTree0 = new MultiShortestPathTree(routingRequest0);
      Vertex vertex0 = null;
      State state0 = multiShortestPathTree0.getState(vertex0);
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      MultiShortestPathTree multiShortestPathTree0 = new MultiShortestPathTree();
      Graph graph0 = null;
      BikeRentalStation bikeRentalStation0 = new BikeRentalStation();
      Set<String> set0 = null;
      bikeRentalStation0.networks = set0;
      BikeRentalStationVertex bikeRentalStationVertex0 = new BikeRentalStationVertex(graph0, bikeRentalStation0);
      String string0 = "org.opentripplanner.routing.spt.MultiShortestPathTree";
      double double0 = (-266.89275606408);
      ExitVertex exitVertex0 = new ExitVertex(graph0, string0, double0, double0);
      MultiShortestPathTree.TIME_EPSILON = bikeRentalStation0.x;
      StreetBikeRentalLink streetBikeRentalLink0 = new StreetBikeRentalLink(bikeRentalStationVertex0, exitVertex0);
      List<Edge> list0 = exitVertex0.getOutgoingStreetEdges();
      Vertex vertex0 = streetBikeRentalLink0.getToVertex();
      // Undeclared exception!
      try { 
        multiShortestPathTree0.getState(vertex0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.opentripplanner.routing.spt.MultiShortestPathTree", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      MultiShortestPathTree multiShortestPathTree0 = new MultiShortestPathTree();
      // Undeclared exception!
      try { 
        multiShortestPathTree0.getVertices();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.opentripplanner.routing.spt.MultiShortestPathTree", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      MultiShortestPathTree multiShortestPathTree0 = new MultiShortestPathTree();
      Graph graph0 = null;
      String string0 = "";
      TransitStopStreetVertex transitStopStreetVertex0 = new TransitStopStreetVertex(graph0, string0, multiShortestPathTree0.WALK_DIST_EPSILON, multiShortestPathTree0.TIME_EPSILON, string0, string0);
      // Undeclared exception!
      try { 
        multiShortestPathTree0.getStates(transitStopStreetVertex0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.opentripplanner.routing.spt.MultiShortestPathTree", e);
      }
  }
}
