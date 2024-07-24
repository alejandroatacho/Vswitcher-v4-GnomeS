//Hinamizawa Variables Down Below:
int opBlock = 3; // kek
WorldPoint currentLocation = client.getLocalPlayer().getWorldLocation();
WorldPoint save_1 = new WorldPoint(2474, 3436, 0);
WorldPoint save_2 = new WorldPoint(2474, 3429, 0);
int lap_1 = 23134;
WorldPoint save_3 = new WorldPoint(2473, 3423, 1);
int lap_2 = 23559;
WorldPoint save_4 = new WorldPoint(2473, 3420, 2);
WorldPoint save_5 = new WorldPoint(2483, 3420, 2);
int lap_3 = 23560;
WorldPoint save_6 = new WorldPoint(2487, 3420, 0);
int lap_4 = 23135;
WorldPoint save_7 = new WorldPoint(2487, 3428, 0);
int lap_5 = 23139;
WorldPoint save_8 = new WorldPoint(2487, 3437, 0);

 if (currentLocation.equals(save_1) && v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {    
    v.invoke("Walk-across","<col=ffff>Log balance",23145,3,58,67,false);           
}

else if (currentLocation.equals(save_2) && v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {

 GameObject jumpLap = v.getGameObject().findNearest(lap_1);
            int jumpLapSceneX = jumpLap.getSceneMinLocation().getX();
            int jumpLapSceneY = jumpLap.getSceneMinLocation().getY();
   
            v.invoke("Jump","<col=ffff>Gap",lap_1,opBlock,jumpLapSceneX,jumpLapSceneY,false);
            }

else if (currentLocation.equals(save_3) && v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {

 GameObject jumpLap1 = v.getGameObject().findNearest(lap_2);
            int jumpLap1SceneX = jumpLap1.getSceneMinLocation().getX();
            int jumpLap1SceneY = jumpLap1.getSceneMinLocation().getY();
   
            v.invoke("Jump","<col=ffff>Gap",lap_2,opBlock,jumpLap1SceneX,jumpLap1SceneY,false);
            }
else if (currentLocation.equals(save_4) && v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {    
            v.invoke("Walk-on","<col=ffff>Balancing rope",23557,3,62,52,false);
}
else if (currentLocation.equals(save_5) && v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {

 GameObject jumpLap2 = v.getGameObject().findNearest(lap_3);
            int jumpLap2SceneX = jumpLap2.getSceneMinLocation().getX();
            int jumpLap2SceneY = jumpLap2.getSceneMinLocation().getY();
   
            v.invoke("Jump","<col=ffff>Gap",lap_3,opBlock,jumpLap2SceneX,jumpLap2SceneY,false);
            }
else if (currentLocation.equals(save_6) && v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {

 GameObject jumpLap3 = v.getGameObject().findNearest(lap_4);
            int jumpLap3SceneX = jumpLap3.getSceneMinLocation().getX();
            int jumpLap3SceneY = jumpLap3.getSceneMinLocation().getY();
   
            v.invoke("Jump","<col=ffff>Gap",lap_4,opBlock,jumpLap3SceneX,jumpLap3SceneY,false);
            }
else if (currentLocation.equals(save_7) && v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {

 GameObject jumpLap4 = v.getGameObject().findNearest(lap_5);
            int jumpLap4SceneX = jumpLap4.getSceneMinLocation().getX();
            int jumpLap4SceneY = jumpLap4.getSceneMinLocation().getY();
   
            v.invoke("Jump","<col=ffff>Gap",lap_5,opBlock,jumpLap4SceneX,jumpLap4SceneY,false);
            }
else if (currentLocation.equals(save_8))
{
v.getWalking().walk(save_1);
}