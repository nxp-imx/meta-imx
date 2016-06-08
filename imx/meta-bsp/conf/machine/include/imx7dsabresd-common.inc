# Provides the i.MX7D SABRE SD common settings

require conf/machine/include/imx-base.inc
require conf/machine/include/tune-cortexa7.inc

DEFAULTTUNE_mx7 ?= "cortexa7hf-neon"

PREFERRED_PROVIDER_virtual/egl_mx7 = "mesa"
PREFERRED_PROVIDER_virtual/libgles1_mx7 = "mesa"
PREFERRED_PROVIDER_virtual/libgles2_mx7 = "mesa"
PREFERRED_PROVIDER_virtual/libgl_mx7 = "mesa"
PREFERRED_PROVIDER_virtual/libg2d_mx7 = ""

# MESA DRI library
XSERVER += "mesa-driver-swrast"
