PREFERRED_PROVIDER_virtual/bootloader_imx = "u-boot-imx"
PREFERRED_PROVIDER_virtual/kernel_imx = "linux-imx"

PREFERRED_VERSION_linux-libc-headers_imx ?= "5.10"

IMX_GPU_VERSION            ?= "6.4.3.p2.6"
IMX_GPU_VERSION_SUFFIX      = "aarch32"
IMX_GPU_VERSION_SUFFIX_mx8  = "aarch64"

PREFERRED_VERSION_imx-gpu-viv               = "${IMX_GPU_VERSION}-${IMX_GPU_VERSION_SUFFIX}"
PREFERRED_VERSION_kernel-module-imx-gpu-viv = "${IMX_GPU_VERSION}"
PREFERRED_VERSION_imx-gpu-g2d               = "${IMX_GPU_VERSION}"
PREFERRED_VERSION_libgpuperfcnt             = "${IMX_GPU_VERSION}"

PREFERRED_PROVIDER_opencl-headers_imxgpu = "imx-gpu-viv"
PREFERRED_PROVIDER_opencl-icd-loader_imxgpu = "imx-gpu-viv"

PREFERRED_VERSION_gstreamer1.0-plugins-base = "1.18.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-bad  = "1.18.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-good = "1.18.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-good-qt = "1.18.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-ugly = "1.18.5"
PREFERRED_VERSION_gstreamer1.0              = "1.18.5.imx"
PREFERRED_VERSION_gstreamer1.0-libav        = "1.18.5"
PREFERRED_VERSION_gstreamer1.0-rtsp-server  = "1.18.5"

PREFERRED_VERSION_gstreamer1.0-plugins-base_mx8 = "1.18.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-bad_mx8  = "1.18.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-good_mx8 = "1.18.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-good-qt_mx8 = "1.18.5.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-ugly_mx8 = "1.18.5"
PREFERRED_VERSION_gstreamer1.0_mx8              = "1.18.5.imx"
PREFERRED_VERSION_gstreamer1.0-libav_mx8        = "1.18.5"
PREFERRED_VERSION_gstreamer1.0-rtsp-server_mx8  = "1.18.5"

PREFERRED_VERSION_imx-gst1.0-plugin     = "4.6.3"

PREFERRED_VERSION_opengl-es-cts_mx6 = "3.2.4.0"
PREFERRED_VERSION_opengl-es-cts_mx7 = "3.2.4.0"

# Use systemd as default init manager
VIRTUAL-RUNTIME_init_manager = "systemd"
PREFERRED_PROVIDER_udev = "systemd"
PREFERRED_PROVIDER_udev-utils = "systemd"
DISTRO_FEATURES_BACKFILL_CONSIDERED = "sysvinit"
POKY_DEFAULT_DISTRO_FEATURES += " systemd"
