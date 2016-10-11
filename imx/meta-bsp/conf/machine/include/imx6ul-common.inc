DEFAULTTUNE_mx6ul ?= "cortexa7hf-neon"

# mx6 GPU libraries
PREFERRED_PROVIDER_virtual/egl_mx6ul = "mesa"
PREFERRED_PROVIDER_virtual/libgles1_mx6ul = "mesa"
PREFERRED_PROVIDER_virtual/libgles2_mx6ul = "mesa"
PREFERRED_PROVIDER_virtual/libgl_mx6ul = "mesa"
PREFERRED_PROVIDER_virtual/libg2d_mx6ul = ""

# MESA DRI library
XSERVER += "mesa-driver-swrast"

MACHINE_SOCARCH_FILTER_mx6ul = "imx-codec imx-parser gst-fsl-plugins"

