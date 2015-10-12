# Use i.MX Kernel, U-Boot and Gstreamer 1.0 providers
PREFERRED_PROVIDER_u-boot_mx5 = "u-boot-fslc"
PREFERRED_PROVIDER_u-boot_mx6 = "u-boot-imx"
PREFERRED_PROVIDER_u-boot_mx6ul = "u-boot-imx"
PREFERRED_PROVIDER_u-boot_mx7 = "u-boot-imx"

PREFERRED_PROVIDER_virtual/kernel_mx6 = "linux-imx"
PREFERRED_PROVIDER_virtual/kernel_mx6ul = "linux-imx"
PREFERRED_PROVIDER_virtual/kernel_mx7 = "linux-imx"

# Masking out community conflicts
# Use new Wayland version
BBMASK = "meta-fsl-arm/recipes-graphics/wayland/weston_%.bbappend"
BBMASK .= "|meta-fsl-arm/recipes-graphics/mesa/mesa_%.bbappend"

# Use qtbase which has qt 5.5 changes
BBMASK .= "|meta-fsl-arm/qt5-layer/recipes-qt/qt5/qtbase_%.bbappend"

# Remove the GST patch on the community
BBMASK .= "|meta-fsl-arm/recipes-multimedia/gstreamer/gstreamer1.0-plugins-base_%.bbappend"

MACHINE_GSTREAMER_1_0_PLUGIN_mx6 = "gst1.0-fsl-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6ul = "gst1.0-fsl-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6q = "gst1.0-fsl-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6dl = "gst1.0-fsl-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sl = "gst1.0-fsl-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sx = "gst1.0-fsl-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx7 = "gst1.0-fsl-plugin"

MACHINE_GSTREAMER_PLUGIN_mx6ul = ""
MACHINE_GSTREAMER_PLUGIN_mx6qp = ""
MACHINE_GSTREAMER_PLUGIN_mx7 = ""

# Default toolchains used in testing i.MX BSPs
DEFAULTTUNE_mx6   = "cortexa9hf-neon"
DEFAULTTUNE_mx6ul = "cortexa7hf-neon"
DEFAULTTUNE_mx7   = "cortexa7hf-neon"

# fido settings - not needed in master
# set these because of meta-fsl-arm override to new xorg version
PREFERRED_VERSION_xserver-xorg_mx6q = "2:1.17.2"
PREFERRED_VERSION_xserver-xorg_mx6dl = "2:1.17.2"
PREFERRED_VERSION_xserver-xorg_mx6s = "2:1.17.2"
PREFERRED_VERSION_xserver-xorg_mx6sl = "2:1.17.2"
PREFERRED_VERSION_xserver-xorg_mx6sx = "2:1.17.2"
PREFERRED_VERSION_xserver-xorg_mx6ul = "2:1.17.2"
PREFERRED_VERSION_xserver-xorg_mx7 = "2:1.17.2"

PREFERRED_VERSION_wayland_mx6 = "1.9.0"
PREFERRED_VERSION_weston_mx6 = "1.9.0"
PREFERRED_VERSION_wayland-native = "1.9.0"
PREFERRED_VERSION_libinput_mx6 = "0.11.0"
PREFERRED_VERSION_xtrans = "1.3.5"
