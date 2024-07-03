using System;
using GTA;
using GTA.Native;
using GTA.Math;

public class GradualBrakeMod : Script
{
    private Vehicle currentVehicle;
    private float brakeForce = 0.0f;
    private const float maxBrakeForce = 1.0f;
    private const float brakeIncrement = 0.01f;

    public GradualBrakeMod()
    {
        Tick += OnTick;
    }

    private void OnTick(object sender, EventArgs e)
    {
        Ped player = Game.Player.Character;
        
        if (player.IsInVehicle())
        {
            currentVehicle = player.CurrentVehicle;

            if (Game.IsControlPressed(2, Control.VehicleBrake))
            {
                if (brakeForce < maxBrakeForce)
                {
                    brakeForce += brakeIncrement;
                }
                currentVehicle.BrakePower = brakeForce;
            }
            else
            {
                brakeForce = 0.0f;
                currentVehicle.BrakePower = brakeForce;
            }

            // Reducir la posibilidad de derrape
            if (currentVehicle.Speed < 2.0f)
            {
                brakeForce = maxBrakeForce; // Aplicar freno completo cuando la velocidad es baja
            }
        }
    }
}
