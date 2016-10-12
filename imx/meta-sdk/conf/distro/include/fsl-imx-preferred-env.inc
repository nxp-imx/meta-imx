# Use i.MX Kernel, U-Boot and Gstreamer 1.0 providers
PREFERRED_PROVIDER_u-boot_mx5 = "u-boot-fslc"
PREFERRED_PROVIDER_u-boot_mx6 = "u-boot-imx"
PREFERRED_PROVIDER_u-boot_mx6ul = "u-boot-imx"
PREFERRED_PROVIDER_u-boot_mx6sll = "u-boot-imx"
PREFERRED_PROVIDER_u-boot_mx7 = "u-boot-imx"

PREFERRED_PROVIDER_virtual/bootloader_mx6 = "u-boot-imx"
PREFERRED_PROVIDER_virtual/bootloader_mx6ul = "u-boot-imx"
PREFERRED_PROVIDER_virtual/bootloader_mx6sll = "u-boot-imx"
PREFERRED_PROVIDER_virtual/bootloader_mx7 = "u-boot-imx"

PREFERRED_PROVIDER_virtual/kernel_mx6 = "linux-imx"
PREFERRED_PROVIDER_virtual/kernel_mx6ul = "linux-imx"
PREFERRED_PROVIDER_virtual/kernel_mx6sll = "linux-imx"
PREFERRED_PROVIDER_virtual/kernel_mx7 = "linux-imx"

MACHINE_GSTREAMER_1_0_PLUGIN_mx6 = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6ul = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sll = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6q = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6dl = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sl = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sx = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx7 = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx8 = "imx-gst1.0-plugin"

# Extra audio support
# Add back some setting for i.MX6ul & i.MX7d which have not been upstreamed
MACHINE_EXTRA_RRECOMMENDS_append_mx6ul = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append_mx6sll = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append_mx7 = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"

# Default toolchains used in testing i.MX BSPs
DEFAULTTUNE_mx6   = "cortexa9hf-neon"
DEFAULTTUNE_mx6ul = "cortexa7hf-neon"
DEFAULTTUNE_mx6sll = "cortexa9hf-neon"
DEFAULTTUNE_mx7   = "cortexa7hf-neon"

# Enable the kenrel loadable module as default
USE_GPU_VIV_MODULE = "1"

PREFERRED_VERSION_linux-libc-headers = "4.1"

# preferred versions of recipes-graphics for mx6
PREFERRED_VERSION_imx-gpu-viv_mx6 = "5.0.11.p8.6-hfp"
PREFERRED_VERSION_xf86-video-imxfb-vivante_mx6 = "5.0.11.p8.6"
PREFERRED_VERSION_kernel-module-imx-gpu-viv_mx6 = "5.0.11.p8.6"

# Use systemd as default init manager - comment out for now
#VIRTUAL-RUNTIME_init_manager = "systemd"
#PREFERRED_PROVIDER_udev = "systemd"
#PREFERRED_PROVIDER_udev-utils = "systemd"
#DISTRO_FEATURES_BACKFILL_CONSIDERED = "sysvinit"
#IMX_DEFAULT_DISTRO_FEATURES += " systemd"

GCCVERSION = "5.3.0"
