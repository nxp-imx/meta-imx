#!/bin/bash
CPUREV=$(cat /sys/devices/soc0/soc_id)
FILEVG=/usr/lib/libOpenVG.so
FILEVG3D=/usr/lib/libOpenVG.3d.so
FILEVG355=/usr/lib/libOpenVG.2d.so
if  [ -e $FILEVG3D ] && [ -e $FILEVG355 ]
then
  if [ -e  $FILEVG ]
  then
        rm -f $FILEVG
  fi
  if [ $CPUREV == "i.MX6DL" ] || [ $CPUREV == "i.MX6SX" ]
  then
        ln -s $FILEVG3D $FILEVG
  fi
  if [ $CPUREV == "i.MX6Q" ] || [ $CPUREV == "i.MX6SL" ]
  then
        ln -s $FILEVG355 $FILEVG
  fi
fi
