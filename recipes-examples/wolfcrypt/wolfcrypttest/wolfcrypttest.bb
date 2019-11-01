SUMMARY = "wolfCrypt Test Application"
DESCRIPTION = "wolfCrypt test application used to test crypto algorithm \
               functionality included in the wolfSSL embedded SSL/TLS library."
HOMEPAGE = "https://www.wolfssl.com"
BUGTRACKER = "https://github.com/wolfssl/wolfssl/issues"
SECTION = "x11/applications"

FILESEXTRAPATHS_prepend := "${THISDIR}:"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://test.c;beginline=1;endline=20;md5=cfa4c4919fe921b3a72740386b1ccb61"

DEPENDS += "wolfssl"

SRC_URI = "file://test.c file://test.h"

S = "${WORKDIR}"

do_compile() {
    ${CC} ${CFLAGS} -DUSE_CERT_BUFFERS_2048 -DUSE_CERT_BUFFERS_256 -DUSE_FLAT_TEST_H -DSIZE_OF_LONG_LONG=8 -Wall -o wolfcrypttest ${WORKDIR}/test.c -lwolfssl ${LDFLAGS}
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/wolfcrypttest ${D}${bindir}
}
