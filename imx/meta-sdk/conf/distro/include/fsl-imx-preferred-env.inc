# Use i.MX Kernel, U-Boot and Gstreamer 1.0 providers
PREFERRED_PROVIDER_virtual/bootloader_imx = "u-boot-imx"
#PREFERRED_PROVIDER_virtual/bootloader_mx6 = "u-boot-imx"
#PREFERRED_PROVIDER_virtual/bootloader_mx6ul = "u-boot-imx"
#PREFERRED_PROVIDER_virtual/bootloader_mx6sll = "u-boot-imx"
#PREFERRED_PROVIDER_virtual/bootloader_mx7d = "u-boot-imx"
#PREFERRED_PROVIDER_virtual/bootloader_mx7ulp = "u-boot-imx"

PREFERRED_PROVIDER_virtual/kernel_imx = "linux-imx"
#PREFERRED_PROVIDER_virtual/kernel_mx6 = "linux-imx"
#PREFERRED_PROVIDER_virtual/kernel_mx6ul = "linux-imx"
#PREFERRED_PROVIDER_virtual/kernel_mx6sll = "linux-imx"
#PREFERRED_PROVIDER_virtual/kernel_mx7d = "linux-imx"
#PREFERRED_PROVIDER_virtual/kernel_mx7ulp = "linux-imx"
#PREFERRED_PROVIDER_virtual/kernel_imx7ulp_zebu = "linux-imx"

PREFERRED_VERSION_linux-libc-headers_imx = "4.9"

MACHINE_GSTREAMER_1_0_PLUGIN_mx6ul = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sll = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6q = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6dl = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sl = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sx = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx7d = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx7ulp = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx8 = "imx-gst1.0-plugin"

# Extra audio support
# Add support for ALL i.MX6/7/8 SoC families
MACHINE_EXTRA_RRECOMMENDS_append_imx = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"

# Default toolchains used in testing i.MX BSPs
DEFAULTTUNE_mx6   = "cortexa9hf-neon"
DEFAULTTUNE_mx6ul = "cortexa7hf-neon"
DEFAULTTUNE_mx6sll = "cortexa9hf-neon"
DEFAULTTUNE_mx7d   = "cortexa7hf-neon"
DEFAULTTUNE_mx7ulp = "cortexa7hf-neon"
DEFAULTTUNE_mx8 = "aarch64"

# Enable the kenrel loadable module as default
USE_GPU_VIV_MODULE = "1"

# preferred versions of recipes-graphics
PREFERRED_PROVIDER_virtual/libg2d_mx6 = "imx-gpu-g2d"
PREFERRED_PROVIDER_virtual/libg2d_mx7ulp = "imx-gpu-g2d"
PREFERRED_PROVIDER_virtual/egl_mx7ulp = "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libgles1_mx7ulp = "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libgles2_mx7ulp = "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libgl_mx7ulp = "imx-gpu-viv"

GRAPHICS_VERSION            ?= "6.2.4.p1.2"
GRAPHICS_VERSION_SUFFIX      = "aarch32"
GRAPHICS_VERSION_SUFFIX_mx8  = "aarch64"

PREFERRED_VERSION_imx-gpu-viv               = "${GRAPHICS_VERSION}-${GRAPHICS_VERSION_SUFFIX}"
PREFERRED_VERSION_xf86-video-imx-vivante    = "${GRAPHICS_VERSION}"
PREFERRED_VERSION_kernel-module-imx-gpu-viv = "${GRAPHICS_VERSION}"
PREFERRED_VERSION_imx-gpu-g2d               = "${GRAPHICS_VERSION}"
PREFERRED_VERSION_openssl                   = "1.0.2m"
PREFERRED_VERSION_openssl-native            = "1.0.2m"

# Use systemd as default init manager
VIRTUAL-RUNTIME_init_manager = "systemd"
PREFERRED_PROVIDER_udev = "systemd"
PREFERRED_PROVIDER_udev-utils = "systemd"
DISTRO_FEATURES_BACKFILL_CONSIDERED = "sysvinit"
IMX_DEFAULT_DISTRO_FEATURES += " systemd"

SOC_HAS_VIVANTE_KERNEL_DRIVER_SUPPORT_mx6 = "1"
SOC_HAS_VIVANTE_KERNEL_DRIVER_SUPPORT_mx7ulp = "1"

UBOOT_SUFFIX_mx6ul = "imx"
SPL_BINARY_mx6ul = ""
UBOOT_MAKE_TARGET_mx6ul = "u-boot.imx"

