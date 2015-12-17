# Use i.MX Kernel, U-Boot and Gstreamer 1.0 providers
PREFERRED_PROVIDER_u-boot_mx5 = "u-boot-fslc"
PREFERRED_PROVIDER_u-boot_mx6 = "u-boot-imx"
PREFERRED_PROVIDER_u-boot_mx6ul = "u-boot-imx"
PREFERRED_PROVIDER_u-boot_mx7 = "u-boot-imx"

PREFERRED_PROVIDER_virtual/kernel_mx6 = "linux-imx"
PREFERRED_PROVIDER_virtual/kernel_mx6ul = "linux-imx"
PREFERRED_PROVIDER_virtual/kernel_mx7 = "linux-imx"

MACHINE_GSTREAMER_1_0_PLUGIN_mx6 = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6ul = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6q = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6dl = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sl = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sx = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx7 = "imx-gst1.0-plugin"

# Default toolchains used in testing i.MX BSPs
DEFAULTTUNE_mx6   = "cortexa9hf-neon"
DEFAULTTUNE_mx6ul = "cortexa7hf-neon"
DEFAULTTUNE_mx7   = "cortexa7hf-neon"

# Use new Wayland version
PREFERRED_VERSION_wayland_mx6 = "1.9.0"
PREFERRED_VERSION_weston_mx6 = "1.9.0"
PREFERRED_VERSION_wayland_mx6ul = "1.9.0"
PREFERRED_VERSION_weston_mx6ul = "1.9.0"
PREFERRED_VERSION_wayland_mx7 = "1.9.0"
PREFERRED_VERSION_weston_mx7 = "1.9.0"
PREFERRED_VERSION_wayland-native = "1.9.0"

# Enable the kenrel loadable module as default
USE_GPU_VIV_MODULE = "1"

GCCVERSION_mx6 = "5.2%"
GCCVERSION_mx6ul = "5.2%"
GCCVERSION_mx7 = "5.2%"
