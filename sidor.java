package brokenrobotgame.model;

import brokenrobotgame.model.navigation.CellPosition;

abstract public class AbstractBattery
{
    private boolean _isDestroy = false;     
    //
    public void destroy()
    {
        _amount�f�harge = 0;
        _isDestroy = true;
    }

    private GameField _field;

    private int _chargeCapacity = 100;                  
    private int _amount�f�harge = _chargeCapacity;    

    public AbstractBattery (GameField field, int capacity, int amount)
    {
       
        if (amount>capacity)
            throw new RuntimeException("ERROR: amount of charge is greater than capacity");

        _field = field;
        _chargeCapacity = capacity;
        _amount�f�harge = amount;
    }

    public int chargeCapacity()
    {
        
        if(_isDestroy)
        {
            throw new RuntimeException("ERROR: battery is destroyed");
        }

        return _chargeCapacity;
    }
    //
    public int amount�f�harge()
    {
        
        if(_isDestroy)
        {
            throw new RuntimeException("ERROR: battery is destroyed");
        }

        return _amount�f�harge;
    }

    public void reduceCharge(int delta)
    {
        
        if(_isDestroy)
        {
            throw new RuntimeException("ERROR: battery is destroyed");
        }

        
        if(delta<0)
        {
            throw new RuntimeException("ERROR: delta is negative");
        }

        _amount�f�harge -= delta;

        if(_amount�f�harge < 0)
            _amount�f�harge = 0;
    }


    CellPosition _position;                           

    public CellPosition position()
    {
      
        if(_isDestroy)
        {
            throw new RuntimeException("ERROR: battery is destroyed");
        }

        return _position;
    }

    boolean setPosition(CellPosition pos)
    {
        boolean success = false;

        if(pos == null)                         
        {
            _position = null;
            success = true;
        }
        else if(_field.battery(pos)!= null)     
        {
            success = false;
        }
        else                                    
        {
            _position = pos;
            success = true;
        }

        return success;
    }
}
