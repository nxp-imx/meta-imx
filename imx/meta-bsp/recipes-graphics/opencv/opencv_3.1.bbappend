# Enable opencl v1.2 in opencv v3.1 for i.MX8
PACKAGECONFIG_append_mx8 = " opencl"

# The opencl headers are included in imx-gpu-viv, add it as build dependency
PACKAGECONFIG[opencl] = "-DWITH_OPENCL=ON,-DWITH_OPENCL=OFF,imx-gpu-viv,"


