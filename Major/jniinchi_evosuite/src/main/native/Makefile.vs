#
# Visual studio based makefile
#
# Copyright 2006-2011 Sam Adams <sea36 at users.sourceforge.net>
#
# This file is part of JNI-InChI.
#
# JNI-InChI is free software: you can redistribute it and/or modify
# it under the terms of the GNU Lesser General Public License as published
# by the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# JNI-InChI is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU Lesser General Public License for more details.
#
# You should have received a copy of the GNU Lesser General Public License
# along with JNI-InChI.  If not, see <http://www.gnu.org/licenses/>.

$(TARGET): $(INCHI_OBJECTS) $(JNI_OBJECTS)
	link.exe /DLL /OUT:$@ $^

$(INCHI_OBJDIR)/%.o: $(INCHI_SRCDIR)/%.c
	cl.exe /c /Ox /I$(INCHI_SRCDIR) /Fo$@ $<

$(JNI_OBJDIR)/%.o: $(JNI_SRCDIR)/%.c $(JNI_HEADERS)
	cl.exe /c /Ox /I$(INCHI_SRCDIR) /I"${JAVA_HOME}/include" /I"${JAVA_HOME}/include/win32" /I$(JNI_HEADER_DIR)  /Fo$@ $<
