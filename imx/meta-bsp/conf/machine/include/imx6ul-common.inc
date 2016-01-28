DEFAULTTUNE_mx6ul ?= "cortexa7hf-neon"

SERIAL_CONSOLE = "115200 ttymxc0"

MACHINE_FEATURES += " pci wifi bluetooth"

MACHINE_FIRMWARE += "linux-firmware-ath6k"

MACHINE_SOCARCH_SUFFIX_mx6ul = "-mx6ul"

XSERVER_DRIVER_mx6ul = "xf86-video-fbdev"

# mx6 GPU libraries
PREFERRED_PROVIDER_virtual/egl_mx6ul = "mesa"
PREFERRED_PROVIDER_virtual/libgles1_mx6ul = "mesa"
PREFERRED_PROVIDER_virtual/libgles2_mx6ul = "mesa"
PREFERRED_PROVIDER_virtual/libgl_mx6ul = "mesa"
PREFERRED_PROVIDER_virtual/libg2d_mx6ul = ""

MACHINE_SOCARCH_FILTER_mx6ul = "imx-codec imx-parser gst-fsl-plugins"

